package ch.post.app.atg.automatic.inventory.v1;

public final class AutomaticInventoryStreamAPIPaths {
    public static final String BASE_URL = "server:8080MQTT";
    public static final String BASE_PATH = "/{sortingUnitPrefix}/inventory/v3";
    public static final class App {
        private App(){} public static final String PATH = BASE_PATH + "/app";
        public final class FeedinglineStartBlock {
            private FeedinglineStartBlock(){} public static final String PATH = BASE_PATH + "/app/feedingline:start-block";
            public final class SrcSystem {
                private SrcSystem(){} public static final String PATH = BASE_PATH + "/app/feedingline:start-block/{srcSystem}";
                public final class SrcInstance {
                    private SrcInstance(){} public static final String PATH = BASE_PATH + "/app/feedingline:start-block/{srcSystem}/{srcInstance}";
                    public final class DstSystem {
                        private DstSystem(){} public static final String PATH = BASE_PATH + "/app/feedingline:start-block/{srcSystem}/{srcInstance}/{dstSystem}";
                        public final class DstInstance {
                            private DstInstance(){} public static final String PATH = BASE_PATH + "/app/feedingline:start-block/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                            public final class ConversationId {
                                private ConversationId(){} public static final String PATH = BASE_PATH + "/app/feedingline:start-block/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                            }
                            public final class BASED {
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{conversationId}";
                                }
                            }
                        }
                        public final class BASED {
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                    public final class BASED {
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
                public final class BASED {
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
            public final class BASED {
                public final class SrcSystem {
                    private SrcSystem(){} public static final String PATH = "/{srcSystem}";
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/{srcSystem}/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
        }
        public final class FeedinglineStopBlock {
            private FeedinglineStopBlock(){} public static final String PATH = BASE_PATH + "/app/feedingline:stop-block";
            public final class SrcSystem {
                private SrcSystem(){} public static final String PATH = BASE_PATH + "/app/feedingline:stop-block/{srcSystem}";
                public final class SrcInstance {
                    private SrcInstance(){} public static final String PATH = BASE_PATH + "/app/feedingline:stop-block/{srcSystem}/{srcInstance}";
                    public final class DstSystem {
                        private DstSystem(){} public static final String PATH = BASE_PATH + "/app/feedingline:stop-block/{srcSystem}/{srcInstance}/{dstSystem}";
                        public final class DstInstance {
                            private DstInstance(){} public static final String PATH = BASE_PATH + "/app/feedingline:stop-block/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                            public final class ConversationId {
                                private ConversationId(){} public static final String PATH = BASE_PATH + "/app/feedingline:stop-block/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                            }
                            public final class BASED {
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{conversationId}";
                                }
                            }
                        }
                        public final class BASED {
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                    public final class BASED {
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
                public final class BASED {
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
            public final class BASED {
                public final class SrcSystem {
                    private SrcSystem(){} public static final String PATH = "/{srcSystem}";
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/{srcSystem}/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
        }
        public final class NioWorkstationBlockidGet {
            private NioWorkstationBlockidGet(){} public static final String PATH = BASE_PATH + "/app/nio-workstation-blockid:get";
            public final class SrcSystem {
                private SrcSystem(){} public static final String PATH = BASE_PATH + "/app/nio-workstation-blockid:get/{srcSystem}";
                public final class SrcInstance {
                    private SrcInstance(){} public static final String PATH = BASE_PATH + "/app/nio-workstation-blockid:get/{srcSystem}/{srcInstance}";
                    public final class DstSystem {
                        private DstSystem(){} public static final String PATH = BASE_PATH + "/app/nio-workstation-blockid:get/{srcSystem}/{srcInstance}/{dstSystem}";
                        public final class DstInstance {
                            private DstInstance(){} public static final String PATH = BASE_PATH + "/app/nio-workstation-blockid:get/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                            public final class ConversationId {
                                private ConversationId(){} public static final String PATH = BASE_PATH + "/app/nio-workstation-blockid:get/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                            }
                            public final class BASED {
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{conversationId}";
                                }
                            }
                        }
                        public final class BASED {
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                    public final class BASED {
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
                public final class BASED {
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
            public final class BASED {
                public final class SrcSystem {
                    private SrcSystem(){} public static final String PATH = "/{srcSystem}";
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/{srcSystem}/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
        }
        public final class BASED {
            public final class FeedinglineStartBlock {
                private FeedinglineStartBlock(){} public static final String PATH = "/feedingline:start-block";
                public final class SrcSystem {
                    private SrcSystem(){} public static final String PATH = "/feedingline:start-block/{srcSystem}";
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/feedingline:start-block/{srcSystem}/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/feedingline:start-block/{srcSystem}/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/feedingline:start-block/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/feedingline:start-block/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
            public final class FeedinglineStopBlock {
                private FeedinglineStopBlock(){} public static final String PATH = "/feedingline:stop-block";
                public final class SrcSystem {
                    private SrcSystem(){} public static final String PATH = "/feedingline:stop-block/{srcSystem}";
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/feedingline:stop-block/{srcSystem}/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/feedingline:stop-block/{srcSystem}/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/feedingline:stop-block/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/feedingline:stop-block/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
            public final class NioWorkstationBlockidGet {
                private NioWorkstationBlockidGet(){} public static final String PATH = "/nio-workstation-blockid:get";
                public final class SrcSystem {
                    private SrcSystem(){} public static final String PATH = "/nio-workstation-blockid:get/{srcSystem}";
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/nio-workstation-blockid:get/{srcSystem}/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/nio-workstation-blockid:get/{srcSystem}/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/nio-workstation-blockid:get/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/nio-workstation-blockid:get/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static final class Machine {
        private Machine(){} public static final String PATH = BASE_PATH + "/machine";
        public final class FeedinglineStartBlockStatus {
            private FeedinglineStartBlockStatus(){} public static final String PATH = BASE_PATH + "/machine/feedingline:start-block:status";
            public final class SrcSystem {
                private SrcSystem(){} public static final String PATH = BASE_PATH + "/machine/feedingline:start-block:status/{srcSystem}";
                public final class SrcInstance {
                    private SrcInstance(){} public static final String PATH = BASE_PATH + "/machine/feedingline:start-block:status/{srcSystem}/{srcInstance}";
                    public final class DstSystem {
                        private DstSystem(){} public static final String PATH = BASE_PATH + "/machine/feedingline:start-block:status/{srcSystem}/{srcInstance}/{dstSystem}";
                        public final class DstInstance {
                            private DstInstance(){} public static final String PATH = BASE_PATH + "/machine/feedingline:start-block:status/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                            public final class ConversationId {
                                private ConversationId(){} public static final String PATH = BASE_PATH + "/machine/feedingline:start-block:status/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                            }
                            public final class BASED {
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{conversationId}";
                                }
                            }
                        }
                        public final class BASED {
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                    public final class BASED {
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
                public final class BASED {
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
            public final class BASED {
                public final class SrcSystem {
                    private SrcSystem(){} public static final String PATH = "/{srcSystem}";
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/{srcSystem}/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
        }
        public final class FeedinglineStopBlockStatus {
            private FeedinglineStopBlockStatus(){} public static final String PATH = BASE_PATH + "/machine/feedingline:stop-block:status";
            public final class SrcSystem {
                private SrcSystem(){} public static final String PATH = BASE_PATH + "/machine/feedingline:stop-block:status/{srcSystem}";
                public final class SrcInstance {
                    private SrcInstance(){} public static final String PATH = BASE_PATH + "/machine/feedingline:stop-block:status/{srcSystem}/{srcInstance}";
                    public final class DstSystem {
                        private DstSystem(){} public static final String PATH = BASE_PATH + "/machine/feedingline:stop-block:status/{srcSystem}/{srcInstance}/{dstSystem}";
                        public final class DstInstance {
                            private DstInstance(){} public static final String PATH = BASE_PATH + "/machine/feedingline:stop-block:status/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                            public final class ConversationId {
                                private ConversationId(){} public static final String PATH = BASE_PATH + "/machine/feedingline:stop-block:status/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                            }
                            public final class BASED {
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{conversationId}";
                                }
                            }
                        }
                        public final class BASED {
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                    public final class BASED {
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
                public final class BASED {
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
            public final class BASED {
                public final class SrcSystem {
                    private SrcSystem(){} public static final String PATH = "/{srcSystem}";
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/{srcSystem}/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
        }
        public final class NioWorkstationBlockidGetStatus {
            private NioWorkstationBlockidGetStatus(){} public static final String PATH = BASE_PATH + "/machine/nio-workstation-blockid:get:status";
            public final class SrcSystem {
                private SrcSystem(){} public static final String PATH = BASE_PATH + "/machine/nio-workstation-blockid:get:status/{srcSystem}";
                public final class SrcInstance {
                    private SrcInstance(){} public static final String PATH = BASE_PATH + "/machine/nio-workstation-blockid:get:status/{srcSystem}/{srcInstance}";
                    public final class DstSystem {
                        private DstSystem(){} public static final String PATH = BASE_PATH + "/machine/nio-workstation-blockid:get:status/{srcSystem}/{srcInstance}/{dstSystem}";
                        public final class DstInstance {
                            private DstInstance(){} public static final String PATH = BASE_PATH + "/machine/nio-workstation-blockid:get:status/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                            public final class ConversationId {
                                private ConversationId(){} public static final String PATH = BASE_PATH + "/machine/nio-workstation-blockid:get:status/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                            }
                            public final class BASED {
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{conversationId}";
                                }
                            }
                        }
                        public final class BASED {
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                    public final class BASED {
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
                public final class BASED {
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
            public final class BASED {
                public final class SrcSystem {
                    private SrcSystem(){} public static final String PATH = "/{srcSystem}";
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/{srcSystem}/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
        }
        public final class BASED {
            public final class FeedinglineStartBlockStatus {
                private FeedinglineStartBlockStatus(){} public static final String PATH = "/feedingline:start-block:status";
                public final class SrcSystem {
                    private SrcSystem(){} public static final String PATH = "/feedingline:start-block:status/{srcSystem}";
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/feedingline:start-block:status/{srcSystem}/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/feedingline:start-block:status/{srcSystem}/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/feedingline:start-block:status/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/feedingline:start-block:status/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
            public final class FeedinglineStopBlockStatus {
                private FeedinglineStopBlockStatus(){} public static final String PATH = "/feedingline:stop-block:status";
                public final class SrcSystem {
                    private SrcSystem(){} public static final String PATH = "/feedingline:stop-block:status/{srcSystem}";
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/feedingline:stop-block:status/{srcSystem}/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/feedingline:stop-block:status/{srcSystem}/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/feedingline:stop-block:status/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/feedingline:stop-block:status/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
            public final class NioWorkstationBlockidGetStatus {
                private NioWorkstationBlockidGetStatus(){} public static final String PATH = "/nio-workstation-blockid:get:status";
                public final class SrcSystem {
                    private SrcSystem(){} public static final String PATH = "/nio-workstation-blockid:get:status/{srcSystem}";
                    public final class SrcInstance {
                        private SrcInstance(){} public static final String PATH = "/nio-workstation-blockid:get:status/{srcSystem}/{srcInstance}";
                        public final class DstSystem {
                            private DstSystem(){} public static final String PATH = "/nio-workstation-blockid:get:status/{srcSystem}/{srcInstance}/{dstSystem}";
                            public final class DstInstance {
                                private DstInstance(){} public static final String PATH = "/nio-workstation-blockid:get:status/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}";
                                public final class ConversationId {
                                    private ConversationId(){} public static final String PATH = "/nio-workstation-blockid:get:status/{srcSystem}/{srcInstance}/{dstSystem}/{dstInstance}/{conversationId}";
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}