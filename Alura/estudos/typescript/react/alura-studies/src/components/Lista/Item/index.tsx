import { iTarefa } from '../../../types/tarefas'
import style from '../Lista.module.scss'

interface Props extends iTarefa {
    selecionaTarefa: (tarefaSelecionada: iTarefa) => void
}

export default function Item(
    { 
        tarefa, 
        tempo, 
        selecionado, 
        completado, 
        id, 
        selecionaTarefa 
    }: Props) {
    console.log('Item atual: ', { tarefa, tempo, selecionado, completado, id });
    
    return (
        <li 
            className={style.item} 
            onClick={() => selecionaTarefa(
                {
                    tarefa, 
                    tempo,
                    selecionado,
                    completado,
                    id
                }
            )}
        >
            <h3>{tarefa}</h3>
            <span>{tempo}</span>
        </li>
    )
}