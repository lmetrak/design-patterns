package pl.lewart.tutorial.design_patterns.creational.builder.maze;

import pl.lewart.tutorial.design_patterns.creational.builder.maze.auxiliary.Maze;

public class MazeDirector {

	private MazeBuilder builder;
	
	public Maze constructMaze() {
		
		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildDoor(1, 2);
		
		return builder.getMaze();
	}
	
	public Maze constructMaze(MazeBuilder mazeBuilder) {
		
		mazeBuilder.buildRoom(1);
		mazeBuilder.buildRoom(2);
		mazeBuilder.buildDoor(1, 2);
		
		return mazeBuilder.getMaze();
	}
	
	
	
	
	
	
	
}
