package controller;

import model.Currency;
import model.CurrencyModel;
import view.CurrencyView;

public class CurrencyController {

    private CurrencyModel model;
    private CurrencyView view;

    public CurrencyController(CurrencyModel model, CurrencyView view) {
        this.model = model;
        this.view = view;

        loadCurrencies();

        view.getFromBox().getItems().addAll(model.getCurrencies());
        view.getToBox().getItems().addAll(model.getCurrencies());

        view.getFromBox().getSelectionModel().select(0);
        view.getToBox().getSelectionModel().select(1);

        view.getConvertButton().setOnAction(e -> convertCurrency());
    }

    private void loadCurrencies() {
        model.addCurrency(new Currency("USD", "US Dollar", 1.0));
        model.addCurrency(new Currency("EUR", "Euro", 0.92));
        model.addCurrency(new Currency("GBP", "British Pound", 0.79));
        model.addCurrency(new Currency("INR", "Indian Rupee", 83.0));
        model.addCurrency(new Currency("JPY", "Japanese Yen", 150.0));
    }

    private void convertCurrency() {
        try {
            double amount = Double.parseDouble(view.getAmountField().getText());

            Currency from = view.getFromBox().getValue();
            Currency to = view.getToBox().getValue();

            if (from == null || to == null) {
                view.getResultField().clear();
                view.getMessageLabel().setText("Please select currencies.");
                return;
            }

            if (amount < 0 || !Double.isFinite(amount)) {
                throw new NumberFormatException();
            }

            double result = amount / from.getRate() * to.getRate();

            if (!Double.isFinite(result)) {
                throw new NumberFormatException();
            }

            view.getResultField().setText(String.format("%.2f", result));
            view.getMessageLabel().setText("");

        } catch (NumberFormatException e) {
            view.getResultField().clear();
            view.getMessageLabel().setText("Please enter a valid amount.");
        }
    }
}