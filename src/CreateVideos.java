import java.util.Scanner;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreateVideos {

	private static Scanner input;

	public static void main(String[] args) {

		String name = "";
		String surname = "";
		String password = "";
		Date registered = new Date();

		String videoTitle = "";
		String videoURL = "";
		String videoTag = "";
		List<Video> myVideos = new ArrayList<Video>();
		List<String> tags = new ArrayList<String>();
		boolean keepCreating = false;
		boolean keepTagging = false;
		int option = 0;

		Keyboard key = new Keyboard();
		input = new Scanner(System.in);

		do {
			try {
				name = key.getString("Escribe tu nombre");
			} catch (IOException e) {
				System.out.println(e.getMessage() + "\n");
			}
		} while (name.isEmpty());

		do {
			try {
				surname = key.getString("Escribe tu apellido");
			} catch (IOException e) {
				System.out.println(e.getMessage() + "\n");
			}
		} while (surname.isEmpty());

		do {
			try {
				password = key.getString("Escribe una password");
			} catch (IOException e) {
				System.out.println(e.getMessage() + "\n");
			}
		} while (password.isEmpty());

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Fecha de registro: " + dateFormat.format(registered));

		User user1 = new User(name, surname, password, registered);
		System.out.println("\n" + "CREA UN NUEVO VIDEO");

		do {
			do {
				try {
					videoTitle = key.getString("Escribe el título: ");
				} catch (IOException e) {
					System.out.println("Se deben rellenar los campos");
				}
			} while (videoTitle.isEmpty());

			do {
				try {
					videoURL = key.getString("Agrega la url donde está el video: ");
				} catch (IOException e) {
					System.out.println("Se deben rellenar los campos");
				}
			} while (videoURL.isEmpty());

			do {
				do {
					try {
						videoTag = key.getString("Escribe un tag para este video: ");
					} catch (IOException e) {
						System.out.println("Se deben rellenar los campos");
					}
				} while (videoTag.isEmpty());

				tags.add(videoTag);

				System.out.println("Quieres agregar otro tag? 1.SI  2.NO");
				option = input.nextInt();

				if (option == 1) {
					keepTagging = true;

				} else if (option == 2) {
					keepTagging = false;
				} else {
					System.out.println("Opción no válida, debes elegir 1 o 2");
					keepTagging = true;
				}

			} while (keepTagging == true);

			option = 0;
			input.nextLine();

			System.out.println("Tags para este video: ");
			for (String v : tags) {
				System.out.print(v + "/ ");
			}

			Video video1 = new Video(videoTitle, videoURL, tags);
			myVideos.add(video1);

			System.out.println("\n" + "Quieres crear otro video? 1.SI  2.NO");
			option = input.nextInt();
			if (option == 1) {
				keepCreating = true;

			} else if (option == 2) {
				keepCreating = false;
			} else {
				System.out.println("Opción no válida, debes introducir 1 o 2");
				keepCreating = true;
			}

		} while (keepCreating == true);

		input.nextLine();

		System.out.println("LISTADO VIDEOS CREADOS");
		for (Video v : myVideos) {
			System.out.println(v.getTitle());
		}

		System.out.println("\n" + "Gracias " + user1.getName() + ". Hasta pronto!");
	}

}
