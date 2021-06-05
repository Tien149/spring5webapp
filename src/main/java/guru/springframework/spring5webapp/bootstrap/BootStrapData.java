//<!-- package guru.springframework.spring5webapp.bootstrap;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import guru.springframework.spring5webapp.domain.Author;
//import guru.springframework.spring5webapp.domain.Book;
//import guru.springframework.spring5webapp.repositories.AuthorRepository;
//import guru.springframework.spring5webapp.repositories.BookRepository;
//
//@Component
//public class BootStrapData implements CommandLineRunner {
//
//	private final AuthorRepository authorRepository;
//	private final BookRepository bookRepository;
//	
//	
//	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
//		this.authorRepository = authorRepository;
//		this.bookRepository = bookRepository;
//	}
//	
//	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		Author eric = new Author("Eric", "ahihi");
//		Book book = new Book("Domain driven Desgin" , "this");
//		
//		eric.getBoks()
//		.add(book);
//		book.getAuthors().add(eric);
//		
//		authorRepository.save(eric);
//		bookRepository.save(book);
//		
//		System.out.println("start in bootrap data");
//		System.out.println("the number of book "+ bookRepository.count());
//		
//		
//		
//		
//		
//		
//	}
//	
//	public AuthorRepository getAuthorRepository() {
//		return authorRepository;
//	}
//	
//	public BookRepository getBookRepository() {
//		return bookRepository;
//	}
//
//}
