package entities;

import org.lwjgl.input.Keyboard;
import org.lwjgl.util.vector.Vector3f;

public class Camera {

	private Vector3f position = new Vector3f(0,0,0);
	private float pitch;
	private float yaw;
	private float roll;
	private float movementSpeed = 1f;//0.1f;
	
	public Camera() {}

	public void move() {
		if(Keyboard.isKeyDown(Keyboard.KEY_W)) {
			position.z -= movementSpeed;
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_S)) {
			position.z += movementSpeed;
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_D)) {
			position.x += movementSpeed;
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_A)) {
			position.x -= movementSpeed;
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_SPACE)) {
			position.y += movementSpeed;
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_C)) {
			position.y -= movementSpeed;
		}
	}
	
	public Vector3f getPosition() {
		return position;
	}

	public float getPitch() {
		return pitch;
	}

	public float getYaw() {
		return yaw;
	}

	public float getRoll() {
		return roll;
	}
	
}
