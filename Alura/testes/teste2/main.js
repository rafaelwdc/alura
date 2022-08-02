
        //*********************************//
        // Jogos de PlayStation & Nintendo // [ Criado em 01/08/2022; ]
        //*********************************//

function exibirMensagem(mensagem){  
    console.log(mensagem)
};

function listaDeJogos(){
    exibirMensagem(`\n###############################################\n`);
    exibirMensagem(`-- # [Jogos de PlayStation] # --`);
    exibirMensagem(`\n###############################################\n`);
    for (let i = 0; i < listaPlayStation.length; i++){
        listaPlayStation[i].informacoes();
        exibirMensagem(`\n###############################################\n`);
    };
    exibirMensagem(`-- # [Jogos da Nintendo] # --`);
    exibirMensagem(`\n###############################################\n`);
    for (let i = 0; i < listaNintendo.length; i++){
        listaNintendo[i].informacoes();
        exibirMensagem(`\n###############################################\n`);
    };
    exibirMensagem(`-- # [Fim da Lista] # --\n\n###############################################\n`);

    exibirMensagem(`-- Saldo final: ${listaPlayStation.length+listaNintendo.length} jogos no total --\n-- Jogos de PlayStation: ${listaPlayStation.length} jogos --\n-- Jogos de Nintendo: ${listaNintendo.length} jogos --\n\n###############################################\n`);
};

class Jogos {
    constructor(nome,desenvolvedora) 
    {
        this.nome = nome;
        this.desenvolvedora = desenvolvedora;
    };
};

class PlayStation extends Jogos {
    constructor(nome,desenvolvedora,edicao,classificacaoIndicativa,panfleto)
    {
        super(nome,desenvolvedora);
        this.edicao = edicao;
        this.classificacaoIndicativa = classificacaoIndicativa;
        this.panfleto = panfleto;
    };

    informacoes(){
        exibirMensagem(`\n-- //**********************// --\n-- // Jogos de PlayStation // --\n-- //**********************// --\n`);
        exibirMensagem(`-- Nome do Jogo: ${this.nome};\n-- Desenvolvido pela Empresa: ${this.desenvolvedora};\n-- Edição: ${this.edicao};\n-- Classificação Indicativa: ${this.classificacaoIndicativa};\n-- Tipo do Panfleto: ${this.panfleto}.\n`);
    };
};

class Nintendo extends Jogos {
    constructor(nome,desenvolvedora,saga,multiplayer) {
        super(nome,desenvolvedora);
        this.saga = saga;
        this.multiplayer = multiplayer
    };

    informacoes(){
        exibirMensagem(`\n-- //*******************//\n-- // Jogos de Nintendo //\n-- //*******************//\n`);
        exibirMensagem(`-- Nome do Jogo: ${this.nome};\n-- Desenvolvido pela Empresa: ${this.desenvolvedora};\n-- Saga: ${this.saga};\n-- Multiplayer: ${this.multiplayer}.\n`);
    };
};
//----------------------------------------------------------------------------------------------------------------------------------------------------//

const assassinsCreedIVBlackFlag = new PlayStation ("Assassin's Creed IV: Black Flag","Ubisoft","Black Label","Acima de 18 Anos","Simples");
const assassinsCreedUnity = new PlayStation ("Assassin's Creed: Unity","Ubisoft","Black Label","Acima de 18 anos","Simples");
const bloodborne = new PlayStation ("BloodBorne","From Software","PlayStation Hits","Acima de 16 anos","Sem planfleto");
const fifa15 = new PlayStation ("FIFA 15","EA Sports","Black Label","Livre","Dois Simples");
const horizonZeroDawn = new PlayStation ("Horizon Zero Dawn","Guerrilla","PlayStation Hits","Acima de 14 anos","Simples");
const infamousSecondSon = new PlayStation ("InFamous: Second Son","Sucker Punch","PlayStation Hits","Acima de 18 anos","Sem panfleto");
const godOfWar = new PlayStation ("God Of War","Santa Monica Studio","Black Label","Acima de 18 Anos","Sem panfleto");
const godOfWarIII = new PlayStation ("God of War III","Santa Monica Studio","Black Label","Acima de 18 Anos","Completo");
const gtaV = new PlayStation ("Grand Theft Auto V","Rockstar Games","Black Label","Acima de 18 Anos","Completo + Mapa");
const nioh = new PlayStation ("Nioh","Team Ninja","PlayStation Hits","Acima de 16 anos","Sem planfleto");
const noMansSky = new PlayStation ("No Man's Sky","Hello Games","Black Label","Acima de 10 anos","Dois Simples");
const projectCars = new PlayStation ("Project Cars","Bandai Nanco","Black Label","Livre","Sem panfleto");
const redDeadRedemptionII = new PlayStation ("Red Dead Redemption II","Rockstar Games","Black Label","Acima de 18 Anos","Simples + Mapa");
const spiderMan = new PlayStation ("Marvel Spider-Man","insomniac Games","Jogo do Ano","Acima de 12 anos","Simples");
const uncharted4 = new PlayStation ("Uncharted 4: A Theif's End","Naughty Dog","Black Label","Acima de 14 anos","Simples");

//----------------------------------------------------------------------------------------------------------------------------------------------------//

const donkeyKongContryTropicalFreeze = new Nintendo ("Donkey Kong Contry: Tropical Freeze","Nintendo","Donkey Kong","Até 2 na mesma tela ou Online");
const zeldaLinksAwakening = new Nintendo ("The Legend of Zelda: Link's Awakening","Nintendo","Zelda","Single Player");
const zeldaBreathOfTheWild = new Nintendo ("The Legend of Zelda: Breath of the Wild","Nintendo","Zelda","Single Player");
const marioParty = new Nintendo("Super Mario Party","Nintendo","Mario","Até 4 na mesma tela ou Online");
const marioOdyssey = new Nintendo("Super Mario Odyssey","Nintendo","Mario","Até 2 na mesma tela");
const mario3d = new Nintendo("Super Mario 3D World + Bowser's Fury","Nintendo","Mario","Até 4 na mesma tela ou Online");
const marioAllStars = new Nintendo("Super Mario 3D All Stars","Nintendo","Mario","Até 2 na mesma tela ou Online");

//----------------------------------------------------------------------------------------------------------------------------------------------------//

const listaPlayStation = [assassinsCreedIVBlackFlag,assassinsCreedUnity,bloodborne,fifa15,horizonZeroDawn,infamousSecondSon,godOfWar,godOfWarIII,gtaV,nioh,noMansSky,projectCars,redDeadRedemptionII,spiderMan,uncharted4];
const listaNintendo = [donkeyKongContryTropicalFreeze,zeldaLinksAwakening,zeldaBreathOfTheWild,marioParty,marioOdyssey,mario3d,marioAllStars];

//exibirMensagem(listaPlayStation[4])

listaDeJogos();
