public class Main {
    public static void main(String[] args){
        int v_int = 14;
        char v_char = 'Y';
        String v_string = "Hello!";
        Double v_double = 2.5;
        float v_float = 2.5f;
        short v_short = 307;
        byte v_byte = -1;
        long v_long = 438000000L;
        boolean v_boolean = false;

        System.out.println(v_int);
        System.out.println(v_char);
        System.out.println(v_string);
        System.out.println(v_double);
        System.out.println(v_float);
        System.out.println(v_short);
        System.out.println(v_byte);
        System.out.println(v_long);
        System.out.println(v_boolean);

        String v_thanks = "Thank you!";
        String v_name = "miguel!";
        String v_order = "Your order number is #";
        int v_number = 715;

        System.out.println(v_thanks + " " + v_name.toUpperCase());
        System.out.println(v_order + (v_number + 1));
    }
}
