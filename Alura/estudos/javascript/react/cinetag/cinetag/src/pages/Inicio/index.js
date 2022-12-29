import Banner from 'componentes/Banner'
import Cabecalho from 'componentes/Cabecalho'
import Card from 'componentes/Card'
import Rodape from 'componentes/Rodape'
import Titulo from 'componentes/Titulo'
import React from 'react'

export default function Inicio() {
  return (
    <>
        <Cabecalho />
        <Banner imagem="home"/>
        <Titulo>
          <h1>Um lugar para guardar seus vídeos e filmes!</h1>
        </Titulo>
        <Card id='1' titulo='Gato Bonifáfio' capa='https://thecatapi.com/api/images/get?format=src&type=png' />
        <Rodape />
    </>
  )
}
