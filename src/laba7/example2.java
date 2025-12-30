package laba7;

public class example2 {
    public static void main(String[] args) {
        SuperClass superObj = new SuperClass("Суперкласс");
        String className = superObj.toString();
        System.out.println(className);

        SubClass subObj = new SubClass(10, "подкласс");
        System.out.println("Подкласс создан: " + subObj);

        subObj.setValue();
        System.out.println("без параметров: " + subObj);

        subObj.setValue("Текст");
        System.out.println("с текстовым параметром: " + subObj);

        subObj.setValue(50);
        System.out.println("с целочисленным параметром: " + subObj);

        subObj.setValue("Новый текст", 100);
        System.out.println("с текстовым и целочисленным параметром: " + subObj);
    }
    public static class SuperClass {
        private String textField;

        public SuperClass(String text) {
            this.textField = text;
        }
        public void setValue(String text) {
            this.textField = text;
        }
        public int getTextLength() {
            return textField != null ? textField.length() : 0;
        }
        public String getTextField() {
            return textField;
        }
        @Override
        public String toString() {
            return "Текст: " + getTextField() + ", Длина текста: " + getTextLength();
        }
    }
    static class SubClass extends SuperClass {
        public int intField;

        public SubClass(int intValue, String textValue) {
            super(textValue);
            this.intField = intValue;
        }
        public void setValue() {
            super.setValue(""); // сбрасываем текстовое поле
            this.intField = 0;
        }
        public void setValue(String text) {
            super.setValue(text);
        }
        public void setValue(int value) {
            this.intField = value;
        }
        public void setValue(String text, int value) {
            super.setValue(text);
            this.intField = value;
        }
        @Override
        public String toString() {
            return "Текст: " + getTextField() + ", Число: " + intField + ", Длина текста: " + getTextLength();
        }
    }
}
