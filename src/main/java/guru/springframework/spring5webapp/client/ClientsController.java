package guru.springframework.spring5webapp.client;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientsController {

	@Autowired
	private ClientRepository clientRepository;

	public void ClientRepository(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	

	@GetMapping
	public List<Client> getClients() {
		List<Client> result = new ArrayList<Client>();
		
		
		clientRepository.findAll().forEach(result::add);
		return result;
		
	}

	@GetMapping("/{id}")
	public Client getClient(@PathVariable Long id) {
		return clientRepository.findById(id).orElseThrow(RuntimeException::new);
	}

	@PostMapping
	public ResponseEntity<Client> createClient(@RequestBody Client client) throws URISyntaxException {
		System.out.println("asdddddddddddddddd");
		System.out.println(client.getName());
		
		System.out.println("is it null " + clientRepository);
		Client savedClient = clientRepository.save(client);
		return ResponseEntity.created(new URI("/clients/" + savedClient.getId())).body(savedClient);
	}

	@PutMapping("/{id}")
	public ResponseEntity updateClient(@PathVariable Long id, @RequestBody Client client) {
		
		Client currentClient = clientRepository.findById(id).orElseThrow(RuntimeException::new);
		currentClient.setName(client.getName());
		currentClient.setEmail(client.getEmail());
		currentClient = clientRepository.save(client);

		return ResponseEntity.ok(currentClient);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity deleteClient(@PathVariable Long id) {
		clientRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
