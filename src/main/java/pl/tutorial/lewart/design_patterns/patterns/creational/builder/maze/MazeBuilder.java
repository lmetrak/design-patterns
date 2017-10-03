package pl.tutorial.lewart.design_patterns.patterns.creational.builder.maze;

import pl.tutorial.lewart.design_patterns.patterns.creational.builder.maze.auxiliary.Maze;

public interface MazeBuilder {

	public void buildMaze();
	public void buildRoom(int room);
	public void buildDoor(int roomFrom, int roomTo);
	public Maze getMaze();
		
}
