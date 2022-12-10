const btnFiltrarNiveisDeFront = document.getElementById('btnFiltrarLivrosFront');
btnFiltrarNiveisDeFront.addEventListener('click', filtrarLivros);

function filtrarLivros() {
    let livrosFiltrados = livros.filter(livro => livro.categoria == 'front-end');
    console.table(livrosFiltrados);
}