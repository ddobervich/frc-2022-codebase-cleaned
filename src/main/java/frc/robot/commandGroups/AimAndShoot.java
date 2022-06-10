// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commandGroups;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.commands.limelight.AlignToTargetFeedForward;

public class AimAndShoot extends ParallelCommandGroup {
  /** Creates a new AimAndShootV2. */
  public AimAndShoot() {
    addCommands(new AlignToTargetFeedForward(),
                new SpinUpAndShoot());
  }
}
