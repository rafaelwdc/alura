import Banner from 'componentes/Banner'
import Cabecalho from 'componentes/Cabecalho'
import Rodape from 'componentes/Rodape'
import React from 'react'

export default function Inicio() {
  return (
    <>
        <Cabecalho />
        <Banner imagem="home"/>
        <Rodape />
    </>
  )
}
