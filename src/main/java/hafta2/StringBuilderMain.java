package hafta2;

public class StringBuilderMain {

    public static void main(String[] args) {

        String name = "patika.dev";
        System.out.println(name);
        System.out.println(name.replace('p','P'));
        System.out.println(name);

        StringBuilder alphabet = new StringBuilder();

        for (char current = 'a'; current <= 'z' ; current++) {
            alphabet.append(current);
        }

        System.out.println(alphabet);


        StringBuilder builder = new StringBuilder();
        builder.append("patika")
                .append(" .dev")
                .append(" java");

                builder.append(" eğitimi");
        System.out.println(builder);

        var hello = "hello patika";
        var hello2 = "hello patika";

        System.out.println(hello.equals(hello2));
        System.out.println(hello == hello2);

        String s ="Heloo world";
        String s1 = " Hello world";

        System.out.println(s == s1);

        var singleString ="hello world";
        var concat = "hello";
        concat += " world";

        System.out.println(singleString.equals(concat));

        System.out.println(singleString == concat);


        var hello3 = "Hello world";
        var hello4 = new String("Hello world");
        System.out.println(hello3 == hello4);





    }
}
