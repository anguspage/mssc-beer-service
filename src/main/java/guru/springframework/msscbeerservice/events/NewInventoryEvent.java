package guru.springframework.msscbeerservice.events;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import lombok.NoArgsConstructor;

/**
 * Created by jantonio on 12/08/2020.
 */
@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
