import React from 'react'
import Card from './Card'


export default function Cards({ itens, style }) {
    return (
        <ul className={style.galeria__cards}>
            {itens.map((item) => {
                return (
                    <Card key={item.id} item={item} style={style} />
                )
            })}
        </ul>
    )
}
