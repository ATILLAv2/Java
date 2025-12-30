package laba7;

public class example5 {
    public static void main(String[] args) {
        SuperClass superObj = new SuperClass("Текст для суперкласса");
        SubClass1 subObj1 = new SubClass1("текст1", 123);
        SubClass2 subObj2 = new SubClass2("текст2", 'A');

        superObj.display();
        subObj1.display();
        subObj2.display();

        SuperClass mainSuper;

        mainSuper = subObj1;
        mainSuper.display();

        mainSuper = subObj2;
        mainSuper.display();
    }
    static class SuperClass {
        private String text;

        public SuperClass(String text) {
            this.text = text;
        }

        public void display() {
            System.out.println("SuperClass, один параметр = \"" + text + "\"");
        }

        public String getText() {
            return text;
        }
    }

    static class SubClass1 extends SuperClass {
        protected int intS;

        public SubClass1(String text, int intValue) {
            super(text);
            this.intS = intValue;
        }

        @Override
        public void display() {
            System.out.println("SubClass1, два параметра = \"" + getText() + "\", число = " + intS);
        }
    }

    static class SubClass2 extends SuperClass {
        protected char charS;

        public SubClass2(String text, char charValue) {
            super(text);
            this.charS = charValue;
        }

        @Override
        public void display() {
            System.out.println("SubClass2, два параметра = \"" + getText() + "\", символ = '" + charS + "'");
        }
    }
}
