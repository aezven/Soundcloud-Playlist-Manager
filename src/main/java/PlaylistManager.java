/**
 * @author Arthur Zvenigorodsky <aezven@gmail.com>
 */

import java.util.ArrayList;

import de.voidplus.soundcloud.Playlist;
import de.voidplus.soundcloud.SoundCloud;
import de.voidplus.soundcloud.User;

public class PlaylistManager {
	private SoundCloud soundcloud;
	
	PlaylistManager(SoundcloudUser userName) {
		if (userName.getName().equals("Arthur Zvenigorodsky")) {
			// Log in to my account
			SoundCloud soundcloud = new SoundCloud("84c18d389fd8de9f9b4b158ed2c0d64c", "4c812d62362770affa7499186d65d91d");
			soundcloud.login("rxevo224@yahoo.com", "mayneplz6");
			

			
			User user = soundcloud.getMe();
		
			ArrayList<Playlist> myPlaylists = soundcloud.getMePlaylists();
			
			for (Playlist playlist : myPlaylists) {
				System.out.println(playlist.getTitle());
			}
			
		}
		
		else {
			System.out.println("Invalid user");
		}
		
	}

}
