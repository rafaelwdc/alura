import Banner from 'componentes/Banner'
import Cabecalho from 'componentes/Cabecalho'
import Card from 'componentes/Card'
import Rodape from 'componentes/Rodape'
import Titulo from 'componentes/Titulo'
import videos from 'json/db.json'
import styles from './Inicio.module.css'
import React from 'react'

export default function Inicio() {
  return (
    <>
        <Cabecalho />
        <Banner imagem="home"/>
        <Titulo>
          <h1>Um lugar para guardar seus vídeos e filmes!</h1>
        </Titulo>
        <section className={styles.container}>
          {videos.map((video) => {
            return <Card {...video} key={video.id} />
          })}
        </section>
        <Rodape />
    </>
  )
}
