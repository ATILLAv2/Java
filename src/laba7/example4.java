package laba7;

public class example4 {
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass('А');
        System.out.println(obj1);

        SubClass obj2 = new SubClass("Текст", 'Б');
        System.out.println(obj2);

        SubSubClass obj3 = new SubSubClass("Новый текст", 'В', 10);
        System.out.println(obj3);

        SuperClass copy1 = new SuperClass(obj1);
        System.out.println("Копия SuperClass: " + copy1);

        SubClass copy2 = new SubClass(obj2);
        System.out.println("Копия SubClass: " + copy2);

        SubSubClass copy3 = new SubSubClass(obj3);
        System.out.println("Копия SubSubClass: " + copy3);
    }

    static class SuperClass {
        public char charS;

        public SuperClass(char charValue) {
            this.charS = charValue;
        }
        public SuperClass(SuperClass obj) {
            this.charS = obj.charS;
        }

        @Override
        public String toString() {
            return "SuperClass, один параметр = " + charS;
        }
    }

    static class SubClass extends SuperClass {
        public String text;

        public SubClass(String textValue, char charValue) {
            super(charValue);
            this.text = textValue;
        }
        public SubClass(SubClass obj) {
            super(obj);
            this.text = obj.text;
        }

        @Override
        public String toString() {
            return "SubClass, два параметра = " + text + ", '" + charS + "'";
        }
    }

    static class SubSubClass extends SubClass {
        public int intS;

        public SubSubClass(String textValue, char charValue, int intValue) {
            super(textValue, charValue);
            this.intS = intValue;
        }
        public SubSubClass(SubSubClass obj) {
            super(obj);
            this.intS = obj.intS;
        }

        @Override
        public String toString() {
            return "SubSubClass, три параметра = " + text + ", '" + charS +
                    "', \"" + intS + "\"";
        }
    }
}
