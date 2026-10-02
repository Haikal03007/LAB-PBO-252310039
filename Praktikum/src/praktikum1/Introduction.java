package praktikum1;

public class Introduction {
	public static void main(String[] args) {
		System.out.println("Oi Jarwo");
		
		//variabel
		int angka1 = 10;
		int angka2 = 20;
		
		//tipe data
		String nama = "Jarwo";
		
		//operator
		int hasiltambah = angka1 + angka2; // pertambahan
		
		// operator perbandingan
		boolean perbandingan = angka1 > angka2;
		boolean tesNama = nama == "Jarwo";
		
		//operator kondisional
		boolean kondisional = (true || false) && (true || true);
		
		//operator assigment
		angka1 *= angka2; //angka1 dikali dengan angka2
							//hasilnya disimpan di angka1
		Dog mydog=new Dog();
		mydog.hungry();
		String name = "Jarwo";
		mydog.puppyName(name);
	}
}