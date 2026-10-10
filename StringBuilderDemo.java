public class StringBuilderDemo {
    public static void  main(String [] args){
        StringBuilder sb = new StringBuilder();

        sb.append("hii ");
        sb.append("i am learning ");
        sb.append("java");
        System.out.println(sb);

        sb.insert(3," inserting something");
        System.out.println(sb);
        sb.delete(3, 12);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.replace(2, 12, "Krishna");
        System.out.println(sb);

        String desc = sb.toString();
        System.out.println(desc);


    }
}
