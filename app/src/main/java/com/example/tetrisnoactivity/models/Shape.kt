package com.example.tetrisnoactivity.models

import java.lang.IllegalArgumentException

enum class Shape(val frameCount: Int, val startPosition: Int) {
    Tetromino(2,2) {
        override fun getFrame(frameNumber: Int): Frame {
            return when (frameNumber) {
                0 -> Frame(4).addRow("1111")
                1 -> Frame(1)
                    .addRow("1")
                    .addRow("1")
                    .addRow("1")
                    .addRow("1")
                else -> throw IllegalAccessException("$frameNumber is an invalid frame number.")
            }
        }
    };

    abstract fun getFrame(frameNumber: Int): Frame
}




enum class Shape(val frameCount: Int, val startPosition: Int) {
    Tetromino1(1,1) {
        override fun getFrame(frameNumber: Int): Frame {
            return Frame(2)
                .addRow("11")
                .addRow("11")
        }
    },


    Tetromino2(2,1) {
    override fun getFrame(frameNumber: Int): Frame {
        return when (frameNumber) {
            0 -> Frame(3)
                .addRow("110")
                .addRow("011")
            1 -> Frame(2)
                .addRow("01")
                .addRow("01")
                .addRow("10")
            else -> throw IllegalArgumentException("$frameNumber is an invalid frame number.")
        }
    }
    },

    Tetromino3(2,1) {
        override fun getFrame(frameNumber: Int): Frame {
            return when (frameNumber) {
                0 -> Frame(3)
                    .addRow("011")
                    .addRow("110")
                1 -> Frame(2)
                    .addRow("10")
                    .addRow("11")
                    .addRow("01")
                else -> throw IllegalArgumentException("$frameNumber is an invalid frame number.")
            }
        }
    },

    Tetromino4(2,2) {
        override fun getFrame(frameNumber: Int): Frame {
            return when (frameNumber) {
                0 -> Frame(4).addRow("1111")
                1 -> Frame(1)
                    .addRow("1")
                    .addRow("1")
                    .addRow("1")
                    .addRow("1")
                else -> throw IllegalAccessException("$frameNumber is an invalid frame number.")
            }
        }
    },

//
    Tetromino5(4,1) {
        override fun getFrame(frameNumber: Int): Frame {
            return when (frameNumber) {
                0 -> Frame(3)
                    .addRow("010")
                    .addRow("111")
                1 -> Frame(2)
                    .addRow("10")
                    .addRow("11")
                    .addRow("10")
                2 -> Frame(3)
                    .addRow("111")
                    .addRow("010")
                3 -> Frame(2)
                    .addRow("01")
                    .addRow("11")
                    .addRow("01")
                else -> throw IllegalArgumentException("$frameNumber is an invalid frame number.")
            }
        }
    },

    Tetromino6(4,1)






}