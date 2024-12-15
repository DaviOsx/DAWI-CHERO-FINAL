package pe.edu.cibertec.DAWI_CHERO_QUISPE_DAVIS.response;

import pe.edu.cibertec.DAWI_CHERO_QUISPE_DAVIS.dto.CardDetailDto;

public record FindCarByIdResponse(String code, String message, CardDetailDto car) {
}
