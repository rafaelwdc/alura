import styles from './BotaoPrincipal.module.css'

import React from 'react'

export default function BotaoPrincipal({ children, tamanho }) {
  return (
    <button className={`
      ${styles.botaoPrincipal}
      ${styles[tamanho]}
    `}>
        {children}
    </button>
  )
}
