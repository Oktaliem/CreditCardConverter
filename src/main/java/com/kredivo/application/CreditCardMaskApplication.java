package com.kredivo.application;

public class CreditCardMaskApplication {

    public CreditCardMaskApplication() {
    }

    /**
     * Assumption of Requirements :
     *
     * @param number is a field that only can be entered by number and it has 16 Digits only, The validation for number format & Digits are on UI level.
     * @param mask   is a drop down list that only has certain value (i.e "xxxxxxxxxxxx####","####-####-####-####", etc). The value is defined.
     */

    public String maskCreditCardNumber(String number, String mask) {
        int index = 0;
        StringBuilder converter = new StringBuilder();
        if (number.equals("")) {
            return "Invalid Request : Number is Empty";
        } else if (mask.equals("")) {
            return "Invalid Request : Mask is Empty";
        } else {
            for (int i = 0; i < mask.length(); i++) {
                char value = mask.charAt(i);
                if (value == '#') {
                    converter.append(number.charAt(index));
                    index++;
                } else if (value == 'x') {
                    converter.append(value);
                    index++;
                } else {
                    converter.append(value);
                }
            }
            return converter.toString();
        }
    }
}
