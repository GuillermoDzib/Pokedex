package com.example.pokedex.pokeapi;

import com.example.pokedex.models.PokemonRespuesta;

import retrofit2.Call;

public interface PokemonService {
    Call<PokemonRespuesta> obtenerListaPokemon();

}
