const { AkairoClient, CommandHandler } = require("discord-akairo");


class MyClient extends AkairoClient {
    constructor() {
        super({
            ownerID: '235827822818623498'
        }, {
            disableMentions: 'everyone'
        });
        this.CommandHandler = new CommandHandler(this, {
            directory: "./commands/",
            prefix: ["chef", "c."]
        });
        this.CommandHandler.loadAll();
    }
}

const client = new MyClient();
client.login("NzY5OTk1MzgzMDcyODgyNjg4.X5XIFQ.TfUii1qtXriI18UP44N4HP379Y4");
