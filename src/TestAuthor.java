public class TestAuthor {
    public static void main(String []args){
        Author a = new Author("Thomas", "ttt77@gmail.com", 'M');
        a.setEmail("thomassuper@gmail.com");
        System.out.println(a.ToString());
    }
}
