abstract class Path {
    abstract path(): String
    url(base?: string): String {
        return (base ? base : AutomaticInventoryStreamAPIPaths.baseUrl) + this.path();
    }
}

class App {
    constructor(private parent){}
    private path() { return this.parent.path() + "/" + "app"; }
    readonly feedinglineStartBlock = new AppFeedinglineStartBlock(this);
    readonly feedinglineStopBlock = new AppFeedinglineStopBlock(this);
    readonly nioWorkstationBlockidGet = new AppNioWorkstationBlockidGet(this);
}

class AppFeedinglineStartBlock {
    constructor(private parent){}
    private path() { return this.parent.path() + "/" + "feedingline:start-block"; }
    srcSystem(srcSystem?: string){ return new AppFeedinglineStartBlockSrcSystem(this, srcSystem); }
}

class AppFeedinglineStartBlockSrcSystem {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{srcSystem}"); }
    srcInstance(srcInstance?: string){ return new AppFeedinglineStartBlockSrcSystemSrcInstance(this, srcInstance); }
}

class AppFeedinglineStartBlockSrcSystemSrcInstance {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{srcInstance}"); }
    dstSystem(dstSystem?: string){ return new AppFeedinglineStartBlockSrcSystemSrcInstanceDstSystem(this, dstSystem); }
}

class AppFeedinglineStartBlockSrcSystemSrcInstanceDstSystem {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{dstSystem}"); }
    dstInstance(dstInstance?: string){ return new AppFeedinglineStartBlockSrcSystemSrcInstanceDstSystemDstInstance(this, dstInstance); }
}

class AppFeedinglineStartBlockSrcSystemSrcInstanceDstSystemDstInstance {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{dstInstance}"); }
    conversationId(conversationId?: string){ return new AppFeedinglineStartBlockSrcSystemSrcInstanceDstSystemDstInstanceConversationId(this, conversationId); }
}

class AppFeedinglineStartBlockSrcSystemSrcInstanceDstSystemDstInstanceConversationId extends Path {
    constructor(private parent, private value?: string){super();}
    path() { return this.parent.path() + "/" + (this.value ? this.value : "{conversationId}"); }
}

class AppFeedinglineStopBlock {
    constructor(private parent){}
    private path() { return this.parent.path() + "/" + "feedingline:stop-block"; }
    srcSystem(srcSystem?: string){ return new AppFeedinglineStopBlockSrcSystem(this, srcSystem); }
}

class AppFeedinglineStopBlockSrcSystem {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{srcSystem}"); }
    srcInstance(srcInstance?: string){ return new AppFeedinglineStopBlockSrcSystemSrcInstance(this, srcInstance); }
}

class AppFeedinglineStopBlockSrcSystemSrcInstance {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{srcInstance}"); }
    dstSystem(dstSystem?: string){ return new AppFeedinglineStopBlockSrcSystemSrcInstanceDstSystem(this, dstSystem); }
}

class AppFeedinglineStopBlockSrcSystemSrcInstanceDstSystem {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{dstSystem}"); }
    dstInstance(dstInstance?: string){ return new AppFeedinglineStopBlockSrcSystemSrcInstanceDstSystemDstInstance(this, dstInstance); }
}

class AppFeedinglineStopBlockSrcSystemSrcInstanceDstSystemDstInstance {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{dstInstance}"); }
    conversationId(conversationId?: string){ return new AppFeedinglineStopBlockSrcSystemSrcInstanceDstSystemDstInstanceConversationId(this, conversationId); }
}

class AppFeedinglineStopBlockSrcSystemSrcInstanceDstSystemDstInstanceConversationId extends Path {
    constructor(private parent, private value?: string){super();}
    path() { return this.parent.path() + "/" + (this.value ? this.value : "{conversationId}"); }
}

class AppNioWorkstationBlockidGet {
    constructor(private parent){}
    private path() { return this.parent.path() + "/" + "nio-workstation-blockid:get"; }
    srcSystem(srcSystem?: string){ return new AppNioWorkstationBlockidGetSrcSystem(this, srcSystem); }
}

class AppNioWorkstationBlockidGetSrcSystem {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{srcSystem}"); }
    srcInstance(srcInstance?: string){ return new AppNioWorkstationBlockidGetSrcSystemSrcInstance(this, srcInstance); }
}

class AppNioWorkstationBlockidGetSrcSystemSrcInstance {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{srcInstance}"); }
    dstSystem(dstSystem?: string){ return new AppNioWorkstationBlockidGetSrcSystemSrcInstanceDstSystem(this, dstSystem); }
}

class AppNioWorkstationBlockidGetSrcSystemSrcInstanceDstSystem {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{dstSystem}"); }
    dstInstance(dstInstance?: string){ return new AppNioWorkstationBlockidGetSrcSystemSrcInstanceDstSystemDstInstance(this, dstInstance); }
}

class AppNioWorkstationBlockidGetSrcSystemSrcInstanceDstSystemDstInstance {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{dstInstance}"); }
    conversationId(conversationId?: string){ return new AppNioWorkstationBlockidGetSrcSystemSrcInstanceDstSystemDstInstanceConversationId(this, conversationId); }
}

class AppNioWorkstationBlockidGetSrcSystemSrcInstanceDstSystemDstInstanceConversationId extends Path {
    constructor(private parent, private value?: string){super();}
    path() { return this.parent.path() + "/" + (this.value ? this.value : "{conversationId}"); }
}

class Machine {
    constructor(private parent){}
    private path() { return this.parent.path() + "/" + "machine"; }
    readonly feedinglineStartBlockStatus = new MachineFeedinglineStartBlockStatus(this);
    readonly feedinglineStopBlockStatus = new MachineFeedinglineStopBlockStatus(this);
    readonly nioWorkstationBlockidGetStatus = new MachineNioWorkstationBlockidGetStatus(this);
}

class MachineFeedinglineStartBlockStatus {
    constructor(private parent){}
    private path() { return this.parent.path() + "/" + "feedingline:start-block:status"; }
    srcSystem(srcSystem?: string){ return new MachineFeedinglineStartBlockStatusSrcSystem(this, srcSystem); }
}

class MachineFeedinglineStartBlockStatusSrcSystem {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{srcSystem}"); }
    srcInstance(srcInstance?: string){ return new MachineFeedinglineStartBlockStatusSrcSystemSrcInstance(this, srcInstance); }
}

class MachineFeedinglineStartBlockStatusSrcSystemSrcInstance {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{srcInstance}"); }
    dstSystem(dstSystem?: string){ return new MachineFeedinglineStartBlockStatusSrcSystemSrcInstanceDstSystem(this, dstSystem); }
}

class MachineFeedinglineStartBlockStatusSrcSystemSrcInstanceDstSystem {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{dstSystem}"); }
    dstInstance(dstInstance?: string){ return new MachineFeedinglineStartBlockStatusSrcSystemSrcInstanceDstSystemDstInstance(this, dstInstance); }
}

class MachineFeedinglineStartBlockStatusSrcSystemSrcInstanceDstSystemDstInstance {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{dstInstance}"); }
    conversationId(conversationId?: string){ return new MachineFeedinglineStartBlockStatusSrcSystemSrcInstanceDstSystemDstInstanceConversationId(this, conversationId); }
}

class MachineFeedinglineStartBlockStatusSrcSystemSrcInstanceDstSystemDstInstanceConversationId extends Path {
    constructor(private parent, private value?: string){super();}
    path() { return this.parent.path() + "/" + (this.value ? this.value : "{conversationId}"); }
}

class MachineFeedinglineStopBlockStatus {
    constructor(private parent){}
    private path() { return this.parent.path() + "/" + "feedingline:stop-block:status"; }
    srcSystem(srcSystem?: string){ return new MachineFeedinglineStopBlockStatusSrcSystem(this, srcSystem); }
}

class MachineFeedinglineStopBlockStatusSrcSystem {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{srcSystem}"); }
    srcInstance(srcInstance?: string){ return new MachineFeedinglineStopBlockStatusSrcSystemSrcInstance(this, srcInstance); }
}

class MachineFeedinglineStopBlockStatusSrcSystemSrcInstance {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{srcInstance}"); }
    dstSystem(dstSystem?: string){ return new MachineFeedinglineStopBlockStatusSrcSystemSrcInstanceDstSystem(this, dstSystem); }
}

class MachineFeedinglineStopBlockStatusSrcSystemSrcInstanceDstSystem {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{dstSystem}"); }
    dstInstance(dstInstance?: string){ return new MachineFeedinglineStopBlockStatusSrcSystemSrcInstanceDstSystemDstInstance(this, dstInstance); }
}

class MachineFeedinglineStopBlockStatusSrcSystemSrcInstanceDstSystemDstInstance {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{dstInstance}"); }
    conversationId(conversationId?: string){ return new MachineFeedinglineStopBlockStatusSrcSystemSrcInstanceDstSystemDstInstanceConversationId(this, conversationId); }
}

class MachineFeedinglineStopBlockStatusSrcSystemSrcInstanceDstSystemDstInstanceConversationId extends Path {
    constructor(private parent, private value?: string){super();}
    path() { return this.parent.path() + "/" + (this.value ? this.value : "{conversationId}"); }
}

class MachineNioWorkstationBlockidGetStatus {
    constructor(private parent){}
    private path() { return this.parent.path() + "/" + "nio-workstation-blockid:get:status"; }
    srcSystem(srcSystem?: string){ return new MachineNioWorkstationBlockidGetStatusSrcSystem(this, srcSystem); }
}

class MachineNioWorkstationBlockidGetStatusSrcSystem {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{srcSystem}"); }
    srcInstance(srcInstance?: string){ return new MachineNioWorkstationBlockidGetStatusSrcSystemSrcInstance(this, srcInstance); }
}

class MachineNioWorkstationBlockidGetStatusSrcSystemSrcInstance {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{srcInstance}"); }
    dstSystem(dstSystem?: string){ return new MachineNioWorkstationBlockidGetStatusSrcSystemSrcInstanceDstSystem(this, dstSystem); }
}

class MachineNioWorkstationBlockidGetStatusSrcSystemSrcInstanceDstSystem {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{dstSystem}"); }
    dstInstance(dstInstance?: string){ return new MachineNioWorkstationBlockidGetStatusSrcSystemSrcInstanceDstSystemDstInstance(this, dstInstance); }
}

class MachineNioWorkstationBlockidGetStatusSrcSystemSrcInstanceDstSystemDstInstance {
    constructor(private parent, private value?: string){}
    private path() { return this.parent.path() + "/" + (this.value ? this.value : "{dstInstance}"); }
    conversationId(conversationId?: string){ return new MachineNioWorkstationBlockidGetStatusSrcSystemSrcInstanceDstSystemDstInstanceConversationId(this, conversationId); }
}

class MachineNioWorkstationBlockidGetStatusSrcSystemSrcInstanceDstSystemDstInstanceConversationId extends Path {
    constructor(private parent, private value?: string){super();}
    path() { return this.parent.path() + "/" + (this.value ? this.value : "{conversationId}"); }
}

export default class AutomaticInventoryStreamAPIPaths {
    private constructor(){}
    static readonly baseUrl = "server:8080MQTT";
    static readonly basePath = "/{sortingUnitPrefix}/inventory/v3";
    private path() { return AutomaticInventoryStreamAPIPaths.basePath; }
    static readonly app = new App(new AutomaticInventoryStreamAPIPaths());
    static readonly machine = new Machine(new AutomaticInventoryStreamAPIPaths());
}

