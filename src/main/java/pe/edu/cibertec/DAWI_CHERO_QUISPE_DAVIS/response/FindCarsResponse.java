package pe.edu.cibertec.DAWI_CHERO_QUISPE_DAVIS.response;

import pe.edu.cibertec.DAWI_CHERO_QUISPE_DAVIS.dto.CarDto;

import java.util.List;

public record FindCarsResponse(String code, String message, List<CarDto> cars) {
}
