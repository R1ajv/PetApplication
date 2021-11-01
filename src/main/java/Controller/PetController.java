package Controller;

@RestController("/v2")
public class PetController {

	@GetMapping("/getPet")
	public String getPet() {
		return "Labradog";
	}
	
	public String updatePet() {
		
	}
}
