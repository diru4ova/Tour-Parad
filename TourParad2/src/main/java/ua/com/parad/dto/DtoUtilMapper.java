package ua.com.parad.dto;

import java.util.ArrayList;
import java.util.List;


import ua.com.parad.entity.Agency;
import ua.com.parad.entity.Chat;
import ua.com.parad.entity.Tour;
import ua.com.parad.entity.Tourist;

public class DtoUtilMapper {
	
	public static List<TouristDTO> touristsToTouristsDTO(List<Tourist> tourists) {

		List<TouristDTO> touristDTOs = new ArrayList<TouristDTO>();

		for (Tourist tourist : tourists) {

			TouristDTO touristDTO = new TouristDTO();
			
			touristDTO.setId(tourist.getId());
			touristDTO.setName(tourist.getName());
			touristDTO.setEmail(tourist.getEmail());
			touristDTO.setPhone(tourist.getPhone());

			touristDTOs.add(touristDTO);

		}

		return touristDTOs;

	}
	
	public static List<AgencyDTO> agencyToAgenciesDTO(List<Agency> agencies) {

		List<AgencyDTO> agencyDTOs = new ArrayList<AgencyDTO>();

		for (Agency agency : agencies) {

			AgencyDTO agencyDTO = new AgencyDTO();
			
			agencyDTO.setId(agency.getId());
			agencyDTO.setName(agency.getName());
			agencyDTO.setPhone_number(agency.getPhone_number());
			agencyDTO.setEmail(agency.getEmail());

			agencyDTOs.add(agencyDTO);

		}

		return agencyDTOs;

	}
	
	public static List<TourDTO> toursToToursDTO(List<Tour> tours) {

		List<TourDTO> tourDTOs = new ArrayList<TourDTO>();

		for (Tour tour : tours) {

			TourDTO tourDTO = new TourDTO();
			
			tourDTO.setId(tour.getId());
			tourDTO.setName(tour.getName());
			tourDTO.setDate(tour.getDate());

			tourDTOs.add(tourDTO);

		}

		return tourDTOs;

	}
	
	public static List<ChatDTO> chatsToChatsDTO(List<Chat> chats) {

		List<ChatDTO> chatDTOs = new ArrayList<ChatDTO>();

		for (Chat chat : chats) {

			ChatDTO chatDTO = new ChatDTO();
			
			chatDTO.setId(chat.getId());
			chatDTO.setTheme(chat.getTheme());
			chatDTO.setShortText(chat.getShortText());

			chatDTOs.add(chatDTO);

		}

		return chatDTOs;

	}
	
	
	

}
