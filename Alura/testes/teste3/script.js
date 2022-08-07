const chalk = require('chalk')
const tabuada = 777;
for (let i = 0; i <= 777;i++) {
let conta = i * tabuada;
console.log(chalk.blue(`${i} x ${tabuada} = ${conta}`));
};