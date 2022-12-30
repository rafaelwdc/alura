import styles from './Favoritos.module.css'

import React from 'react'
import Banner from 'componentes/Banner'
import Titulo from 'componentes/Titulo'
import Card from 'componentes/Card'

export default function Favoritos() {
  return (
    <>
      <Banner imagem="favoritos" />
      <Titulo> <h1>Meus Favoritos</h1> </Titulo>
      <section className={`${styles.container}`}>
        <Card id='2' titulo='Foto do Rafael Matheus' capa='https://github.com/rafaelwdc.png' />
      </section>
    </>

  )
}
