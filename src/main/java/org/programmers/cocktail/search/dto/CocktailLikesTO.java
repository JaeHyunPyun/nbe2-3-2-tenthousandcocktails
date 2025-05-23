package org.programmers.cocktail.search.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CocktailLikesTO {
    private Long id;
    private Long userId;
    private Long cocktailId;

}
