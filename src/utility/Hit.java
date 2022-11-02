package utility;

import grid.Grid;

public class Hit implements CoordinateState {
    private static Hit state;

    private Hit(){}

    public static Hit state() {
        if(state == null){
            state = new Hit();
        }
        return state;
    }
    @Override
    public void updateState(Coordinate context)
    {
        System.out.println("Hit");
        context.setState(Hit.state());
    }
}
