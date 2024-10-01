public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Sue Grant", "suGrant@somewhere.com", 'F');

        System.out.println(author); // Вывод информации об авторе
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());

        // Изменение email и вывод обновленной информации
        author.setEmail("newEmail@somewhere.com");
        System.out.println("Updated Email: " + author.getEmail());
    }
}
