import { iTarefa } from '../../types/tarefas';
import Item from './Item';
import style from './Lista.module.scss'

function Lista ({ tarefas }: {tarefas: iTarefa[]}) {
    
    return (
        <aside className={style.listaTarefas}>
            <h2>Estudos do Dia</h2>
            <ul>
                {tarefas.map((item, index) =>  (
                    <Item
                        key={index}
                        {...item}
                    />
                ))}
                
            </ul>
        </aside>
    )
}

export default Lista;