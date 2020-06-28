public class Test {

    public class GoodsStateMachineTest {

       /* @Test
        public void testStateMachine() throws Exception {
            // 获取一个builder
            Builder<GoodsStatesEnum, GoodsEventsEnum> builder = StateMachineBuilder.builder();

            // 设置为自动启动
            builder.configureConfiguration().withConfiguration()
                    .autoStartup(true)
                    .machineId("testMachine");

            // 设置状态流转
            // 如machine收到EVENT GoodsEventsEnum.INIT_GOOD的时候，会从GOOD_INIT流转到POOL_INIT
            builder.configureTransitions().withExternal()
                    .source(GoodsStatesEnum.GOOD_INIT).target(GoodsStatesEnum.POOL_INIT).event(GoodsEventsEnum.CREATE_POOL)
                    .and()
                    .withExternal()
                    .source(GoodsStatesEnum.POOL_INIT).target(GoodsStatesEnum.SUPPLY_SCENE_INIT).event(GoodsEventsEnum.CREATE_SUPPLY_SCENE)
                    .and()
                    .withExternal()
                    .source(GoodsStatesEnum.SUPPLY_SCENE_INIT).target(GoodsStatesEnum.SUPPLY).event(GoodsEventsEnum.SUPPLY);

            // 这里是自动流转的关键
            // 每达到一个状态，都定义一个action，action中又触发了一个event，使machine往下一个状态流转
            builder.configureStates().withStates().initial(GoodsStatesEnum.GOOD_INIT)
                    .states(EnumSet.allOf(GoodsStatesEnum.class))
                    .stateDo(GoodsStatesEnum.POOL_INIT, getCreatePoolAction("pool state reached,and start to create pool"))
                    .stateDo(GoodsStatesEnum.SUPPLY_SCENE_INIT, getSupplyAction("start to supply"));

            StateMachine stateMachine = builder.build();
            stateMachine.sendEvent(GoodsEventsEnum.CREATE_POOL);
            Thread.sleep(500);
            System.out.println(stateMachine.getState());
        }

        Action<GoodsStatesEnum, GoodsEventsEnum> getCreatePoolAction(String input) {
            return new Action<GoodsStatesEnum, GoodsEventsEnum>() {
                @Override
                public void execute(StateContext<GoodsStatesEnum, GoodsEventsEnum> context) {
                    System.out.println(" in getCreatePoolAction " + input);
                    context.getStateMachine().sendEvent(GoodsEventsEnum.CREATE_SUPPLY_SCENE);

                }
            };
        }

        Action<GoodsStatesEnum, GoodsEventsEnum> getSupplyAction(String input) {
            return new Action<GoodsStatesEnum, GoodsEventsEnum>() {
                @Override
                public void execute(StateContext<GoodsStatesEnum, GoodsEventsEnum> context) {
                    System.out.println(" in get supply Action " + input);
                    context.getStateMachine().sendEvent(GoodsEventsEnum.SUPPLY);

                }
            };
        }
    }*/

    }
}
