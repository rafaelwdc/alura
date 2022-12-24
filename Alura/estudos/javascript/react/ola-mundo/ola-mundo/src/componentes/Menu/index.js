import { Link } from 'react-router-dom'
import styles from './Menu.module.css'

export default function Menu() {
  return (
    <header>
        <nav className={styles.navegacao}>
            <Link className={styles.link} to="/">
                Início
            </Link>
            <Link className={styles.link} to="/sobremim/">
                Sobre Mim
            </Link>
        </nav>
    </header>
  )
}
