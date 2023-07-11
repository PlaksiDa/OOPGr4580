package Domen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class VendingMachineFrame extends JFrame {
    private DefaultListModel<String> productListModel;
    private JList<String> productList;
    private JTextField paymentField;
    private JButton buyButton;

    private List<Product> products;

    public VendingMachineFrame(List<Product> products) {
        this.products = products;

        setTitle("Vending Machine");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400, 300));

        // Создаем модель списка продуктов
        productListModel = new DefaultListModel<>();
        for (Product product : products) {
            productListModel.addElement(product.getName());
        }

        // Создаем список продуктов
        productList = new JList<>(productListModel);
        JScrollPane scrollPane = new JScrollPane(productList);
        add(scrollPane, BorderLayout.CENTER);

        // Создаем поле ввода для наличности
        paymentField = new JTextField();
        add(paymentField, BorderLayout.NORTH);

        // Создаем кнопку "Купить товар"
        buyButton = new JButton("Купить товар");
        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = productList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Product selectedProduct = products.get(selectedIndex);
                    int paymentAmount = Integer.parseInt(paymentField.getText());

                    if (paymentAmount >= selectedProduct.getPrice()) {
                        // Вычитаем стоимость товара из внесенной наличности
                        int change = paymentAmount - selectedProduct.getPrice();
                        paymentField.setText(String.valueOf(change));

                        // Добавьте здесь логику покупки товара
                        // на основе выбранного продукта и введенной наличности
                        // ...

                        // Пример вывода информации о покупке в консоль
                        System.out.println("Куплен продукт: " + selectedProduct.getName());
                        System.out.println("Стоимость: " + selectedProduct.getPrice());
                        System.out.println("Сдача: " + change);
                    } else {
                        JOptionPane.showMessageDialog(
                                VendingMachineFrame.this,
                                "Недостаточно средств для покупки",
                                "Ошибка",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }
                }
            }
        });
        add(buyButton, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }
}