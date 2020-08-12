package guru.springframework.msscbeerservice.events;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.*;

import java.io.Serializable;

/**
 * Created by jantonio on 12/08/2020.
 */
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -3248857530373176819L;

    private BeerDto beerDto;
}
