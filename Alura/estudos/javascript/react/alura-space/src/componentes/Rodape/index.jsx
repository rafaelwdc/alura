import React from 'react';
import facebook from './facebook.svg';
import twitter from './twitter.svg';
import instagram from './instagram.svg';
import styles from './Rodape.module.scss';

export default function Rodape() {
  return (
    <footer className={styles.rodape}>
        <div className={styles.rodape__icones}>
            <a 
                href="https://www.facebook.com/AluraCursosOnline/"
                target="_blank"
                rel="noreferrer"
            >
                <img src={facebook} alt="ícone do Facebook" />
            </a>
            <a 
                href="https://twitter.com/aluraonline?lang=en"
                target="_blank"
                rel="noreferrer"
            >
                <img src={twitter} alt="ícone do Twitter" />
            </a>
            <a 
                href="https://instagram.com/aluraonline/?hl=en"
                target="_blank"
                rel="noreferrer"
            >
                <img src={instagram} alt="ícone do Instagram" />
            </a>
        </div>
        <p>Desenvolvido pela Alura</p>
    </footer>
  );
}
