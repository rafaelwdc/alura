import Botao from "../Botao";
import Relogio from "./Relogio";
import style from './Cronometro.module.scss'
import { iTarefa } from "../../types/tarefas";
import { useEffect, useState } from "react"
import { tempoParaSegundos } from "../../common/utils/time";

interface Props {
    selecionado: iTarefa | undefined
}

export function Cronometro ({ selecionado }: Props) {
    const [tempo, setTempo] = useState<number>();
    useEffect(() => {
        if(selecionado?.tempo) {
            setTempo(tempoParaSegundos(selecionado.tempo))
        }
    }, [selecionado])
    return (
        <div className={style.cronometro}>
            <p className={style.titulo}>
                Escolha um card e inicie o Cronometro
            </p>
            <div className={style.relogioWrapper}>
                <Relogio tempo={tempo} />
            </div>
            <Botao>
                Começar!
            </Botao>
        </div>
    )
}