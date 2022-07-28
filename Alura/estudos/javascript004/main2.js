

console.log(``);
console.log(``);
console.log(``);
console.log(``);    



const nomes = [' João', ' Juliana', ' Ana', ' Caio', ' Lara', ' Marjorie', ' Guilherme', ' Aline', ' Fabiana', ' Andre', ' Carlos', ' Paulo', ' Bia', ' Vivian', ' Isabela', ' Vinícius', ' Renan', ' Renata', ' Daisy', ' Camilo'];
console.log("\n//--------------------------------------------------------------------------------//\n");
const sala1 = nomes.slice(0, nomes.length/2);
const sala2 = nomes.slice(nomes.length/2);
console.log(`:: Quantidade de alunos :: \n:: #### ${nomes.length} #### :: \n\n:: Quantidade de aluno sala 1 :: \n:: #### ${nomes.length/2} #### ::\n\n:: Quantidade de aluno sala 2 :: \n:: #### ${nomes.length/2} #### ::`);
console.log("\n//--------------------------------------------------------------------------------//\n");
console.log(`Alunos da sala 1 : \n -> ${sala1}\n`);
console.log(`Alunos da sala 2 : \n -> ${sala2}`);
console.log("\n//--------------------------------------------------------------------------------//\n");
console.log(`Atualizando lista de chamadas \n`);
sala1.splice(1,3,' Rodrigo');
sala1.splice(4,6,' Leo');
console.log(`Sala 1 : ${sala1}`);
console.log(`\n\n:: Quantidade de alunos :: \n:: #### ${sala1.length + sala2.length} #### :: \n\n:: Quantidade de aluno sala 1 :: \n:: #### ${sala1.length} #### ::\n\n:: Quantidade de aluno sala 2 :: \n:: #### ${sala2.length} #### ::`);
console.log("\n//--------------------------------------------------------------------------------//\n");
console.log(`Juntando Salas\n`);
const alunos = sala1.concat(sala2);
console.log(`Salas juntas fica assim: ${alunos}\n`);
console.log("\n//--------------------------------------------------------------------------------//\n");
console.log(`Atribuindo notas\n`);
const notas = [7.5,8.9,6.8,10,7.5,8,6.8,7.5,10,7.5,8,9.5,7.5,7.5,6.5];
const media = [alunos,notas];
for(let i = 0; i < notas.length; i++){
    console.log(`${media[0][i]}, sua média é de ${media[1][i]};\n`);
}
console.log("\n//--------------------------------------------------------------------------------//\n");
console.log(`Media das notas dos Alunos: \n`);
let somaDasNotas = 0;
for(let i = 0; i<notas.length;i++) {somaDasNotas += notas[i]}
let medias = somaDasNotas/notas.length;
console.log(`A Média das notas dos alunos é: ${medias.toFixed(1)}`);
console.log("\n//--------------------------------------------------------------------------------//\n");
console.log(``);