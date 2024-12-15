package pe.edu.cibertec.DAWI_CHERO_QUISPE_DAVIS.dto;

public record CarDto(Integer carId,
                     String make,
                     String model,
                     Integer year,
                     String licensePlate,
                     String ownerName) {
}
