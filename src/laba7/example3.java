package laba7;

public class example3 {
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass(10);
        System.out.println(obj1);

        SubClass obj2 = new SubClass(20, 'А');
        System.out.println(obj2);

        SubSubClass obj3 = new SubSubClass(30, 'Б', "Текст");
        System.out.println(obj3);

        obj1.setValue(100);
        System.out.println("После метода: " + obj1);

        obj2.setValue(200, 'В');
        System.out.println("После метода: " + obj2);

        obj3.setValue(300, 'Г', "Новый текст");
        System.out.println("После метода: " + obj3);
    }

    static class SuperClass {
        public int intS;

        public SuperClass(int intValue) {
            this.intS = intValue;
        }
        public void setValue(int intValue) {
            this.intS = intValue;
        }

        @Override
        public String toString() {
            return "SuperClass, один параметр = " + intS;
        }
    }

    static class SubClass extends SuperClass {
        public char charS;

        public SubClass(int intValue, char charValue) {
            super(intValue);
            this.charS = charValue;
        }
        public void setValue(int intValue, char charValue) {
            super.setValue(intValue);
            this.charS = charValue;
        }

        @Override
        public String toString() {
            return "SubClass, два параметра = " + intS + ", '" + charS + "'";
        }
    }

    static class SubSubClass extends SubClass {
        public String text;

        public SubSubClass(int intValue, char charValue, String textValue) {
            super(intValue, charValue);
            this.text = textValue;
        }
        public void setValue(int intValue, char charValue, String textValue) {
            super.setValue(intValue, charValue);
            this.text = textValue;
        }

        @Override
        public String toString() {
            return "SubSubClass, три параметра = " + intS + ", '" + charS +
                    "', \"" + text + "\"";
        }
    }
}
