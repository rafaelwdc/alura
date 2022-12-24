import styles from './PostModelo.module.css'

import React from 'react'

export default function PostModelo({ children, fotoCapa, titulo }) {
  return (
    <article className={styles.postModeloContainer}>
        <div
            className={styles.fotoCapa}
            style={{ backgroundImage: `url(${fotoCapa})` }}
        ></div>
        <h2 className={styles.titulo}>
            {titulo}
        </h2>

        <div className={styles.postModeloContainer}>
            {children}
        </div>
    </article>
  )
}
