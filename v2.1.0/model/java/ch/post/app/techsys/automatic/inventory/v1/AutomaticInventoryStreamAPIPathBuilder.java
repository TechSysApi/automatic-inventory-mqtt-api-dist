package ch.post.app.techsys.automatic.inventory.v1;

public final class AutomaticInventoryStreamAPIPathBuilder {
    public static final String BASE_URL = "server:8080MQTT";
    public static final String BASE_PATH = "/inventory/v2";
    public static abstract class Path {
        protected abstract String path();
    }
    public static abstract class Endpoint extends Path {
        public abstract String path();
        public final String url() {
            return BASE_URL + path();
        }
        public final String url(String base) {
            return base + path();
        }
        public final String relativeTo(String other) {
            if (!path().startsWith(other)) { throw new IllegalArgumentException(other + " is not a prefix of " + path()); }
            return path().substring(other.length());
        }
        public final String relativeTo(Path other) {
            return relativeTo(other.path());
        }
    }
    public static final App app = new App();
    public static final class App extends Path {
        private App(){}
        protected String path() { return "/inventory/v2/" + "/app"; }
        public final FeedinglineStartBlock feedinglineStartBlock = new FeedinglineStartBlock();
        public final class FeedinglineStartBlock extends Path {
            private FeedinglineStartBlock(){}
            protected String path() { return App.this.path() + "/feedingline:start-block"; }
            public final SrcSystem srcSystem(String srcSystem){ return new SrcSystem(srcSystem); }
            public final class SrcSystem extends Path {
                private final String value;
                private SrcSystem(String srcSystem){ this.value = srcSystem; }
                protected String path() { return FeedinglineStartBlock.this.path() + "/" + value; }
                public final SrcInstance srcInstance(String srcInstance){ return new SrcInstance(srcInstance); }
                public final class SrcInstance extends Path {
                    private final String value;
                    private SrcInstance(String srcInstance){ this.value = srcInstance; }
                    protected String path() { return SrcSystem.this.path() + "/" + value; }
                    public final DstSystem dstSystem(String dstSystem){ return new DstSystem(dstSystem); }
                    public final class DstSystem extends Path {
                        private final String value;
                        private DstSystem(String dstSystem){ this.value = dstSystem; }
                        protected String path() { return SrcInstance.this.path() + "/" + value; }
                        public final DstInstance dstInstance(String dstInstance){ return new DstInstance(dstInstance); }
                        public final class DstInstance extends Path {
                            private final String value;
                            private DstInstance(String dstInstance){ this.value = dstInstance; }
                            protected String path() { return DstSystem.this.path() + "/" + value; }
                            public final ConversationId conversationId(String conversationId){ return new ConversationId(conversationId); }
                            public final class ConversationId extends Endpoint {
                                private final String value;
                                private ConversationId(String conversationId){ this.value = conversationId; }
                                public final String path() { return DstInstance.this.path() + "/" + value; }
                            }
                        }
                    }
                }
            }
        }
        public final FeedinglineStopBlock feedinglineStopBlock = new FeedinglineStopBlock();
        public final class FeedinglineStopBlock extends Path {
            private FeedinglineStopBlock(){}
            protected String path() { return App.this.path() + "/feedingline:stop-block"; }
            public final SrcSystem srcSystem(String srcSystem){ return new SrcSystem(srcSystem); }
            public final class SrcSystem extends Path {
                private final String value;
                private SrcSystem(String srcSystem){ this.value = srcSystem; }
                protected String path() { return FeedinglineStopBlock.this.path() + "/" + value; }
                public final SrcInstance srcInstance(String srcInstance){ return new SrcInstance(srcInstance); }
                public final class SrcInstance extends Path {
                    private final String value;
                    private SrcInstance(String srcInstance){ this.value = srcInstance; }
                    protected String path() { return SrcSystem.this.path() + "/" + value; }
                    public final DstSystem dstSystem(String dstSystem){ return new DstSystem(dstSystem); }
                    public final class DstSystem extends Path {
                        private final String value;
                        private DstSystem(String dstSystem){ this.value = dstSystem; }
                        protected String path() { return SrcInstance.this.path() + "/" + value; }
                        public final DstInstance dstInstance(String dstInstance){ return new DstInstance(dstInstance); }
                        public final class DstInstance extends Path {
                            private final String value;
                            private DstInstance(String dstInstance){ this.value = dstInstance; }
                            protected String path() { return DstSystem.this.path() + "/" + value; }
                            public final ConversationId conversationId(String conversationId){ return new ConversationId(conversationId); }
                            public final class ConversationId extends Endpoint {
                                private final String value;
                                private ConversationId(String conversationId){ this.value = conversationId; }
                                public final String path() { return DstInstance.this.path() + "/" + value; }
                            }
                        }
                    }
                }
            }
        }
        public final NioWorkstationBlockidGet nioWorkstationBlockidGet = new NioWorkstationBlockidGet();
        public final class NioWorkstationBlockidGet extends Path {
            private NioWorkstationBlockidGet(){}
            protected String path() { return App.this.path() + "/nio-workstation-blockid:get"; }
            public final SrcSystem srcSystem(String srcSystem){ return new SrcSystem(srcSystem); }
            public final class SrcSystem extends Path {
                private final String value;
                private SrcSystem(String srcSystem){ this.value = srcSystem; }
                protected String path() { return NioWorkstationBlockidGet.this.path() + "/" + value; }
                public final SrcInstance srcInstance(String srcInstance){ return new SrcInstance(srcInstance); }
                public final class SrcInstance extends Path {
                    private final String value;
                    private SrcInstance(String srcInstance){ this.value = srcInstance; }
                    protected String path() { return SrcSystem.this.path() + "/" + value; }
                    public final DstSystem dstSystem(String dstSystem){ return new DstSystem(dstSystem); }
                    public final class DstSystem extends Path {
                        private final String value;
                        private DstSystem(String dstSystem){ this.value = dstSystem; }
                        protected String path() { return SrcInstance.this.path() + "/" + value; }
                        public final DstInstance dstInstance(String dstInstance){ return new DstInstance(dstInstance); }
                        public final class DstInstance extends Path {
                            private final String value;
                            private DstInstance(String dstInstance){ this.value = dstInstance; }
                            protected String path() { return DstSystem.this.path() + "/" + value; }
                            public final ConversationId conversationId(String conversationId){ return new ConversationId(conversationId); }
                            public final class ConversationId extends Endpoint {
                                private final String value;
                                private ConversationId(String conversationId){ this.value = conversationId; }
                                public final String path() { return DstInstance.this.path() + "/" + value; }
                            }
                        }
                    }
                }
            }
        }
    }
    public static final Machine machine = new Machine();
    public static final class Machine extends Path {
        private Machine(){}
        protected String path() { return "/inventory/v2/" + "/machine"; }
        public final FeedinglineStartBlockStatus feedinglineStartBlockStatus = new FeedinglineStartBlockStatus();
        public final class FeedinglineStartBlockStatus extends Path {
            private FeedinglineStartBlockStatus(){}
            protected String path() { return Machine.this.path() + "/feedingline:start-block:status"; }
            public final SrcSystem srcSystem(String srcSystem){ return new SrcSystem(srcSystem); }
            public final class SrcSystem extends Path {
                private final String value;
                private SrcSystem(String srcSystem){ this.value = srcSystem; }
                protected String path() { return FeedinglineStartBlockStatus.this.path() + "/" + value; }
                public final SrcInstance srcInstance(String srcInstance){ return new SrcInstance(srcInstance); }
                public final class SrcInstance extends Path {
                    private final String value;
                    private SrcInstance(String srcInstance){ this.value = srcInstance; }
                    protected String path() { return SrcSystem.this.path() + "/" + value; }
                    public final DstSystem dstSystem(String dstSystem){ return new DstSystem(dstSystem); }
                    public final class DstSystem extends Path {
                        private final String value;
                        private DstSystem(String dstSystem){ this.value = dstSystem; }
                        protected String path() { return SrcInstance.this.path() + "/" + value; }
                        public final DstInstance dstInstance(String dstInstance){ return new DstInstance(dstInstance); }
                        public final class DstInstance extends Path {
                            private final String value;
                            private DstInstance(String dstInstance){ this.value = dstInstance; }
                            protected String path() { return DstSystem.this.path() + "/" + value; }
                            public final ConversationId conversationId(String conversationId){ return new ConversationId(conversationId); }
                            public final class ConversationId extends Endpoint {
                                private final String value;
                                private ConversationId(String conversationId){ this.value = conversationId; }
                                public final String path() { return DstInstance.this.path() + "/" + value; }
                            }
                        }
                    }
                }
            }
        }
        public final FeedinglineStopBlockStatus feedinglineStopBlockStatus = new FeedinglineStopBlockStatus();
        public final class FeedinglineStopBlockStatus extends Path {
            private FeedinglineStopBlockStatus(){}
            protected String path() { return Machine.this.path() + "/feedingline:stop-block:status"; }
            public final SrcSystem srcSystem(String srcSystem){ return new SrcSystem(srcSystem); }
            public final class SrcSystem extends Path {
                private final String value;
                private SrcSystem(String srcSystem){ this.value = srcSystem; }
                protected String path() { return FeedinglineStopBlockStatus.this.path() + "/" + value; }
                public final SrcInstance srcInstance(String srcInstance){ return new SrcInstance(srcInstance); }
                public final class SrcInstance extends Path {
                    private final String value;
                    private SrcInstance(String srcInstance){ this.value = srcInstance; }
                    protected String path() { return SrcSystem.this.path() + "/" + value; }
                    public final DstSystem dstSystem(String dstSystem){ return new DstSystem(dstSystem); }
                    public final class DstSystem extends Path {
                        private final String value;
                        private DstSystem(String dstSystem){ this.value = dstSystem; }
                        protected String path() { return SrcInstance.this.path() + "/" + value; }
                        public final DstInstance dstInstance(String dstInstance){ return new DstInstance(dstInstance); }
                        public final class DstInstance extends Path {
                            private final String value;
                            private DstInstance(String dstInstance){ this.value = dstInstance; }
                            protected String path() { return DstSystem.this.path() + "/" + value; }
                            public final ConversationId conversationId(String conversationId){ return new ConversationId(conversationId); }
                            public final class ConversationId extends Endpoint {
                                private final String value;
                                private ConversationId(String conversationId){ this.value = conversationId; }
                                public final String path() { return DstInstance.this.path() + "/" + value; }
                            }
                        }
                    }
                }
            }
        }
        public final NioWorkstationBlockidGetStatus nioWorkstationBlockidGetStatus = new NioWorkstationBlockidGetStatus();
        public final class NioWorkstationBlockidGetStatus extends Path {
            private NioWorkstationBlockidGetStatus(){}
            protected String path() { return Machine.this.path() + "/nio-workstation-blockid:get:status"; }
            public final SrcSystem srcSystem(String srcSystem){ return new SrcSystem(srcSystem); }
            public final class SrcSystem extends Path {
                private final String value;
                private SrcSystem(String srcSystem){ this.value = srcSystem; }
                protected String path() { return NioWorkstationBlockidGetStatus.this.path() + "/" + value; }
                public final SrcInstance srcInstance(String srcInstance){ return new SrcInstance(srcInstance); }
                public final class SrcInstance extends Path {
                    private final String value;
                    private SrcInstance(String srcInstance){ this.value = srcInstance; }
                    protected String path() { return SrcSystem.this.path() + "/" + value; }
                    public final DstSystem dstSystem(String dstSystem){ return new DstSystem(dstSystem); }
                    public final class DstSystem extends Path {
                        private final String value;
                        private DstSystem(String dstSystem){ this.value = dstSystem; }
                        protected String path() { return SrcInstance.this.path() + "/" + value; }
                        public final DstInstance dstInstance(String dstInstance){ return new DstInstance(dstInstance); }
                        public final class DstInstance extends Path {
                            private final String value;
                            private DstInstance(String dstInstance){ this.value = dstInstance; }
                            protected String path() { return DstSystem.this.path() + "/" + value; }
                            public final ConversationId conversationId(String conversationId){ return new ConversationId(conversationId); }
                            public final class ConversationId extends Endpoint {
                                private final String value;
                                private ConversationId(String conversationId){ this.value = conversationId; }
                                public final String path() { return DstInstance.this.path() + "/" + value; }
                            }
                        }
                    }
                }
            }
        }
    }
}